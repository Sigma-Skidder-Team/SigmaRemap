package com.mentalfrostbyte.jello.module.settings.impl;

import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.module.settings.SettingType;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class SpeedRampSetting extends Setting<SpeedRampSetting.SpeedRamp> {
    public SpeedRampSetting(String name, String description, float start, float middle, float end, float max) {
        super(name, description, SettingType.SPEEDRAMP, new SpeedRamp(start, middle, end, max));
    }

    @Override
    public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) throws JSONException {
        this.currentValue = new SpeedRamp(CJsonUtils.getJSONArrayOrNull(jsonObject, "value"));
        return jsonObject;
    }

    @Override
    public JSONObject buildUpSettingData(JSONObject jsonObject) {
        jsonObject.put("name", this.getName());
        jsonObject.put("value", this.getCurrentValue().toJSONArray());
        return jsonObject;
    }

    public void updateValues(float start, float middle, float end, float max) {
        this.setValues(start, middle, end, max, true);
    }

    public float[] getValues() {
        SpeedRamp ramp = this.getCurrentValue();
        return new float[]{ramp.startValue, ramp.middleValue, ramp.endValue, ramp.maxValue};
    }

    public void setValues(float start, float middle, float end, float max, boolean notify) {
        SpeedRamp newRamp = new SpeedRamp(start, middle, end, max);
        if (!this.currentValue.equals(newRamp)) {
            this.currentValue = newRamp;
            if (notify) {
                this.notifyObservers();
            }
        }
    }

    public static class SpeedRamp {
        public float startValue;
        public float middleValue;
        public float endValue;
        public float maxValue;

        public SpeedRamp(float start, float middle, float end, float max) {
            this.startValue = start;
            this.middleValue = middle;
            this.endValue = end;
            this.maxValue = max;
        }

        public SpeedRamp(JSONArray jsonArray) throws JSONException {
            this.startValue = Float.parseFloat(jsonArray.getString(0));
            this.middleValue = Float.parseFloat(jsonArray.getString(1));
            this.endValue = Float.parseFloat(jsonArray.getString(2));
            this.maxValue = Float.parseFloat(jsonArray.getString(3));
        }

        public JSONArray toJSONArray() {
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(0, Float.toString(this.startValue));
            jsonArray.put(1, Float.toString(this.middleValue));
            jsonArray.put(2, Float.toString(this.endValue));
            jsonArray.put(3, Float.toString(this.maxValue));
            return jsonArray;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (obj instanceof SpeedRamp) {
                SpeedRamp other = (SpeedRamp) obj;
                return this.startValue == other.startValue
                        && this.middleValue == other.middleValue
                        && this.endValue == other.endValue
                        && this.maxValue == other.maxValue;
            } else {
                return false;
            }
        }
    }
}