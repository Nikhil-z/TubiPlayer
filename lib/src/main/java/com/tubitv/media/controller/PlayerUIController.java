package com.tubitv.media.controller;

import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;

import com.google.android.exoplayer2.SimpleExoPlayer;

/**
 * Created by allensun on 8/3/17.
 * on Tubitv.com, allengotstuff@gmail.com
 */
public class PlayerUIController {

    private SimpleExoPlayer contentPlayer;

    private SimpleExoPlayer adPlayer;

    private WebView vpaidWebView;

    private View exoPlayerView;

    private int adResumeWindow;

    private long adResumePosition;

    private int movieResumeWindow;

    private long movieResumePosition;

    public PlayerUIController(@Nullable SimpleExoPlayer contentPlayer, @Nullable SimpleExoPlayer adPlayer, @Nullable WebView vpaidWebView, @Nullable View exoPlayerView) {
        this.contentPlayer = contentPlayer;
        this.adPlayer = adPlayer;
        this.vpaidWebView = vpaidWebView;
        this.exoPlayerView = exoPlayerView;
    }

    public SimpleExoPlayer getContentPlayer() {
        return contentPlayer;
    }

    public SimpleExoPlayer getAdPlayer() {
        return adPlayer;
    }

    public WebView getVpaidWebView() {
        return vpaidWebView;
    }

    public View getExoPlayerView() {
        return exoPlayerView;
    }

    public void setContentPlayer(SimpleExoPlayer contentPlayer) {
        this.contentPlayer = contentPlayer;
    }

    public void setAdResumeInfo(int window, long position) {
        adResumeWindow = window;
        adResumePosition = position;
    }

    public void setMovieResumeInfo(int window, long position) {
        movieResumeWindow = window;
        movieResumePosition = position;
    }

    public int getAdResumeWindow() {
        return adResumeWindow;
    }

    public long getAdResumePosition() {
        return adResumePosition;
    }

    public int getMovieResumeWindow() {
        return movieResumeWindow;
    }

    public long getMovieResumePosition() {
        return movieResumePosition;
    }

    public void setAdPlayer(SimpleExoPlayer adPlayer) {
        this.adPlayer = adPlayer;
    }

    public void setVpaidWebView(WebView vpaidWebView) {
        this.vpaidWebView = vpaidWebView;
    }

    public void setExoPlayerView(View exoPlayerView) {
        this.exoPlayerView = exoPlayerView;
    }

    public static class Builder {

        private SimpleExoPlayer contentPlayer = null;

        private SimpleExoPlayer adPlayer = null;

        private WebView vpaidWebView = null;

        private View exoPlayerView = null;

        public Builder() {
        }

        public Builder setContentPlayer(SimpleExoPlayer contentPlayer) {
            this.contentPlayer = contentPlayer;
            return this;
        }

        public Builder setAdPlayer(SimpleExoPlayer adPlayer) {
            this.adPlayer = adPlayer;
            return this;
        }

        public Builder setVpaidWebView(WebView vpaidWebView) {
            this.vpaidWebView = vpaidWebView;
            return this;
        }

        public Builder setExoPlayerView(View exoPlayerView) {
            this.exoPlayerView = exoPlayerView;
            return this;
        }

        public PlayerUIController build() {

            return new PlayerUIController(contentPlayer, adPlayer, vpaidWebView, exoPlayerView);
        }
    }

}
