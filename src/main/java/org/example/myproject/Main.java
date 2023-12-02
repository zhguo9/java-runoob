package org.example.myproject;

import com.renomad.minum.web.*;

public class Main {

    public static void main(String[] args) {
        // Start the system
        FullSystem fs = FullSystem.initialize();

        new Endpoints(fs).registerEndpoints();

        fs.block();
    }
}
