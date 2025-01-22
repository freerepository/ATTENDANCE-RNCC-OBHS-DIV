package com.sedulous.attendancernccobhs.Models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class WorkTypeModel implements Serializable {

    @SerializedName("success")
    public int mStatus;
    @SerializedName("message")
    public String mMessage;
    @SerializedName("work_types")
    public ArrayList<WorkTypeItem> mWorkTypeItems;
    public static class WorkTypeItem implements Serializable{

        @SerializedName("id")
        public String mWorkTypeId;
        @SerializedName("name")
        public String mWorkTypeName;

    }

}
