package com.termux.api;

import android.content.Context;
import android.content.Intent;
import android.util.JsonWriter;

import com.termux.api.util.ResultReturner;

import org.json.JSONObject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * API that allows you to get call log history information
 */
public class CallLogAPI {

    static void onReceive(final Context context, final JSONObject opts) {
        final int offset = opts.optInt("offset");
        final int limit = opts.optInt("limit", 50);

        ResultReturner.returnData(context, new ResultReturner.ResultJsonWriter() {
            public void writeJson(JsonWriter out) throws Exception {
                out.beginObject();
                out.name("error").value("Call log is no longer permitted by Google");
                out.endObject();
            }
        });

    }

}
