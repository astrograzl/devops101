package com.gfa.devops.models;

import java.sql.Timestamp;

public interface Activity {
    Timestamp begin = null;
    Timestamp finish = null;
    default Double duration() {
        // return (begin != null && finish != null) ? finish - begin : 0L;
        return new Double(0.0);
    }
}
