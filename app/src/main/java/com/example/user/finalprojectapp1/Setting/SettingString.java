package com.example.user.finalprojectapp1.Setting;

public class SettingString {
    public static String device_name = "Tang 1";

    public SettingString() {
    }

    public static String getDevice_name() {
        return device_name;
    }

    public static void setDevice_name(String device_name) {
        SettingString.device_name = device_name;
    }
}
