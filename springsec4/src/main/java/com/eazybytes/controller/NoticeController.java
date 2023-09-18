package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notice")
    public String getNoticeDetails() {
        return "Inquiry notice details are saved to the DB";
    }

}
