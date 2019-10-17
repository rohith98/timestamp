package service;

import entity.TimeStampEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TimeStampRepository;
import request.TimeStampRequest;
import response.TimeStampResponse;

public class TimeStampService {
    @Autowired
    TimeStampRepository timeStampRepository;

    public TimeStampResponse postApi(TimeStampRequest timeStampRequest){
        TimeStampResponse timeStampResponse = new TimeStampResponse();

        TimeStampEntity timeStampEntity = new TimeStampEntity();
        if(timeStampRequest.getOperation().equals("create")){
            timeStampEntity.setTimeStamp(timeStampRequest.getTimeStamp());
            timeStampRepository.save(timeStampEntity);
            timeStampResponse.setResponse("Valid");
        }
        return timeStampResponse;
    }

}
