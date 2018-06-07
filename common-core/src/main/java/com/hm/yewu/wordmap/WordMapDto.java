package com.hm.yewu.wordmap;

import javax.persistence.*;

@Entity
@Table(name="word_map")
public class WordMapDto {
    @Id
    @Column(name = "word_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long wordId;

    @Column(name = "word")
    private String word;

    @Column(name = "mapper")
    private String mapper;

    @Column(name="create_by")
    private String createBy;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;

    @Override
    public String toString() {
        return "WordMapDto{" +
                "wordId=" + wordId +
                ", word='" + word + '\'' +
                ", mapper='" + mapper + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }

    public Long getWordId() {
        return wordId;
    }

    public void setWordId(Long wordId) {
        this.wordId = wordId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMapper() {
        return mapper;
    }

    public void setMapper(String mapper) {
        this.mapper = mapper;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
