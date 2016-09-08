
package com.example.mypc.gotitappdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Question {

    @SerializedName("qid")
    private String qid;
    @SerializedName("title")
    private String title;
    @SerializedName("tid")
    @Expose
    private String tid;
    @SerializedName("processing_status")
    private String processingStatus;
    @SerializedName("processing_data")
    private ProcessingData processingData;
    @SerializedName("created")
    private String created;
    @SerializedName("updated")
    private String updated;
    @SerializedName("author")
    private Author author;
    @SerializedName("ts")
    private String ts;
    @SerializedName("attachments")
    private List<Attachment> attachments = new ArrayList<Attachment>();

    /**
     * @return The qid
     */
    public String getQid() {
        return qid;
    }

    /**
     * @param qid The qid
     */
    public void setQid(String qid) {
        this.qid = qid;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param tid The tid
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * @return The processingStatus
     */
    public String getProcessingStatus() {
        return processingStatus;
    }

    /**
     * @param processingStatus The processing_status
     */
    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    /**
     * @return The processingData
     */
    public ProcessingData getProcessingData() {
        return processingData;
    }

    /**
     * @param processingData The processing_data
     */
    public void setProcessingData(ProcessingData processingData) {
        this.processingData = processingData;
    }

    /**
     * @return The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return The updated
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * @param updated The updated
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * @return The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return The ts
     */
    public String getTs() {
        return ts;
    }

    /**
     * @param ts The ts
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     * @return The attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * @param attachments The attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

}
