package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;
    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardwrite";
    }
    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){
        System.out.println("hello");
        System.out.println(board.getTitle());

        boardService.write(board);

        return "";
    }

}
