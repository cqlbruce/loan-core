package com.wu.fund.common.req;



import java.io.Serializable;

public class OldRequestHeader implements Serializable {

    private String channel_no;

    private  String req_time;

    private String service_type;


    public String getChannel_no() {
        return channel_no;
    }

    public void setChannel_no(String channel_no) {
        this.channel_no = channel_no;
    }

    public String getReq_time() {
        return req_time;
    }

    public void setReq_time(String req_time) {
        this.req_time = req_time;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }
}
