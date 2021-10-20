package com.uhg.gpd.ole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    oleService service;

    @RequestMapping(method = RequestMethod.GET, value = "/data")
    public ResponseEntity<Object> getData(){
        return new ResponseEntity<>(service.getOleData(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/time")
    public ResponseEntity<Object> getWithTime(@RequestBody time t){
        return new ResponseEntity<>(service.getWithTime(t.getTime()), HttpStatus.ACCEPTED);
    }

}
