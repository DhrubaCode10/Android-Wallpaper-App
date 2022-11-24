package com.dhrubajyotih.mywallpaper.Listeners;

import com.dhrubajyotih.mywallpaper.Models.SearchApiResponse;

public interface SearchResponseListener {

    void onFetch(SearchApiResponse response,String message);
    void onError(String message);
}
