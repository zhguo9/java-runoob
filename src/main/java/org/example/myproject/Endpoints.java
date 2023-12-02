package org.example.myproject;

import com.renomad.minum.web.FullSystem;
import com.renomad.minum.web.RequestLine;
import com.renomad.minum.web.Response;

public class Endpoints {

    private final FullSystem fullSystem;

    public Endpoints(FullSystem fullSystem) {
        this.fullSystem = fullSystem;
    }

    public void registerEndpoints() {
        fullSystem.getWebFramework().registerPath(
                RequestLine.Method.GET,
                "",
                request -> Response.htmlOk("<p>Hi there world!</p>"));
    }
}