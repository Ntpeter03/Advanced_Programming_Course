package com.n;

public class Student <Name, StudentNumber, Father, Scores>{
    public Name name;
    public StudentNumber sNum;
    public Father father;
    public Scores scores;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public StudentNumber getsNum() {
        return sNum;
    }

    public void setsNum(StudentNumber sNum) {
        this.sNum = sNum;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }
}
