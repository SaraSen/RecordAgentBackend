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
@CrossOrigin("*")
public class RecordingController {

    @Autowired
    private RecordRepository recordRepository;

    @PostMapping(value = "/addrecording")
    public String addRecording(@RequestBody Recording recording) {
        recordRepository.save(recording);
        return "Recording Added with ID : " + recording.getId();
    }

    @GetMapping("/getallrecordings")
    public List<Recording> retriveAllRecordings() {
        return recordRepository.findAll();
    }

    @GetMapping("/getrecordings/{id}")
    public Optional<Recording> getRecordingById(@PathVariable int id) {
      return recordRepository.findById(id);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteRecording(@PathVariable int id){
        recordRepository.deleteById(id);
        return "Recording Deleted" + id;
    }

}
