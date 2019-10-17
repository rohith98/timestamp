package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import request.TimeStampRequest;
import response.TimeStampResponse;
import service.TimeStampService;

@CrossOrigin
@RestController
public class TimeStampController {
    @Autowired
    TimeStampService timeStampService;

    @PostMapping
    public TimeStampResponse postApi(@RequestBody TimeStampRequest timeStampRequest){
        return timeStampService.postApi(timeStampRequest);
    }
}
