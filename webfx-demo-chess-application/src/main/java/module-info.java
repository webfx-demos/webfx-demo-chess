// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.chess.application {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires webfx.extras.scalepane;
    requires webfx.platform.console;
    requires webfx.platform.resource;

    // Exported packages
    exports com.orangomango.chess;
    exports com.orangomango.chess.multiplayer;

    // Resources packages
    opens images;
    opens sounds;

    // Provided services
    provides javafx.application.Application with com.orangomango.chess.MainApplication;

}