package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    // board write
    public void write(Board board){
        boardRepository.save(board);
    }

    // board list view
    public List<Board> boardList(){
        return boardRepository.findAll();
    }

    // view specific content
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();
    }

    // delete board content
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }


}
