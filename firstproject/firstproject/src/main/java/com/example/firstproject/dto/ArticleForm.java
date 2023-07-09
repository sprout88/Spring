package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
