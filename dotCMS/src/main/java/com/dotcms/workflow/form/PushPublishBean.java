package com.dotcms.workflow.form;

import com.dotcms.repackage.com.fasterxml.jackson.annotation.JsonCreator;
import com.dotcms.repackage.com.fasterxml.jackson.annotation.JsonProperty;

public class PushPublishBean {

  private final String whereToSend;
  private final String publishDate;
  private final String publishTime;
  private final String expireDate;
  private final String expireTime;
  private final String neverExpire;
  private final String forcePush;

  @JsonCreator
  public PushPublishBean(
      @JsonProperty("whereToSend") final String whereToSend,
      @JsonProperty("publishDate") final String publishDate,
      @JsonProperty("publishTime") final String publishTime,
      @JsonProperty("expireDate") final String expireDate,
      @JsonProperty("expireTime") final String expireTime,
      @JsonProperty("neverExpire") final String neverExpire,
      @JsonProperty("forcePush") final String forcePush) {
    this.whereToSend = whereToSend;
    this.publishDate = publishDate;
    this.publishTime = publishTime;
    this.expireDate = expireDate;
    this.expireTime = expireTime;
    this.neverExpire = neverExpire;
    this.forcePush = forcePush;
  }

  public String getWhereToSend() {
    return whereToSend;
  }

  public String getPublishDate() {
    return publishDate;
  }

  public String getPublishTime() {
    return publishTime;
  }

  public String getExpireDate() {
    return expireDate;
  }

  public String getExpireTime() {
    return expireTime;
  }

  public String getNeverExpire() {
    return neverExpire;
  }

  public String getForcePush() {
    return forcePush;
  }
}
