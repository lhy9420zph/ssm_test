package com.itheima.domain;

import java.util.Date;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-15 16:27
 **/
public class Log {
    private Integer id;
    private String name;
    private Date time;
    private String url;
    private Long cost;
    private String operation;
    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", url='" + url + '\'' +
                ", cost=" + cost +
                ", operation='" + operation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
