package com.hm.yewu.wordmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class WordMapController {
    @Autowired
    private WordMapRepository wordMapRepository;

    @GetMapping(value = "word")
    public List<WordMapDto> getWordMapperList() {

        return wordMapRepository.findAll();
    }
}
