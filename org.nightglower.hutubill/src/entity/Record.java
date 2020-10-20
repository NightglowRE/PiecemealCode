package entity;

import java.util.Date;

/**
 * @ClassName Record
 * @Description 实体类，对应数据库中的 record (消费分类表)。
 * @Author NightGlower
 * @Date 2020/7/15 16:16
 * @Version 1.0
 */
public class Record {
    public int spend;
    public int id;
    public int cid;
    public String comment;
    public Date date;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getSpend() {
        return spend;
    }
    public void setSpend(int spend) {
        this.spend = spend;
    }

}
