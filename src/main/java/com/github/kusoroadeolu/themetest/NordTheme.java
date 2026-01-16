package com.github.kusoroadeolu.themetest;

import com.github.kusoroadeolu.clique.Clique;
import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class NordTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "nord";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.of(
                "nord-frost1", new CustomAnsiCode("\u001B[38;2;143;188;187m"),  // Cyan
                "nord-frost2", new CustomAnsiCode("\u001B[38;2;136;192;208m"),  // Bright cyan
                "nord-frost3", new CustomAnsiCode("\u001B[38;2;129;161;193m"),  // Blue
                "nord-frost4", new CustomAnsiCode("\u001B[38;2;94;129;172m"),   // Dark blue
                "nord-aurora1", new CustomAnsiCode("\u001B[38;2;191;97;106m"),  // Red
                "nord-aurora2", new CustomAnsiCode("\u001B[38;2;208;135;112m"), // Orange
                "nord-aurora3", new CustomAnsiCode("\u001B[38;2;235;203;139m"), // Yellow
                "nord-aurora4", new CustomAnsiCode("\u001B[38;2;163;190;140m"), // Green
                "nord-aurora5", new CustomAnsiCode("\u001B[38;2;180;142;173m")  // Purple
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}