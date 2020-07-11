package com.accelero.hwm.resource;

import com.accelero.hwm.model.Recording;
import com.accelero.hwm.repository.RecordRepository;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class RecordingController {

    @Autowired
    private RecordRepository recordRepository;

    @PostMapping(value = "/addrecording")
    public String addRecording(@RequestBody Recording recording) {
        recordRepository.save(recording);
        return "Recording Added" + recording.getId();
    }

    @GetMapping("/getallrecordings")
    public List<Recording> retriveAllRecordings() {
        return recordRepository.findAll();
    }

    @GetMapping("/getrecordings/{Id}")
    public Optional<Recording> getRecordingById(@PathVariable String Id) {
      return recordRepository.findById(Id);

    }

    @DeleteMapping("/delete/{Id}")
    public String deleteRecording(@PathVariable String Id){
        recordRepository.deleteById(Id);
        return "Recording Deleted" + Id;
    }

}
