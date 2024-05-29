// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.chess.application {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires webfx.extras.panes;
    requires webfx.platform.ast;
    requires webfx.platform.console;
    requires webfx.platform.fetch.ast.json;
    requires webfx.platform.resource;
    requires webfx.stack.ui.dialog;

    // Exported packages
    exports com.orangomango.chess;
    exports com.orangomango.chess.multiplayer;

    // Resources packages
    opens images;
    opens sounds;

    // Provided services
    provides javafx.application.Application with com.orangomango.chess.MainApplication;

}