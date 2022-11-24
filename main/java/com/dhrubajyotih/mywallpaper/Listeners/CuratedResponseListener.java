package com.dhrubajyotih.mywallpaper.Listeners;

import com.dhrubajyotih.mywallpaper.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);


}
