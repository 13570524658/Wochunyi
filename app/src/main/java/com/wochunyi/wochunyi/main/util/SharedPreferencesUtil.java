package com.wochunyi.wochunyi.main.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.wochunyi.wochunyi.data.config.SharedPreferenceData.SHARED_CONFIG;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 */
public class SharedPreferencesUtil {
    private SharedPreferences mSharedpreferences;
    private Context mContext;


    public SharedPreferencesUtil(Context context) {
        this.mContext = context;
        mSharedpreferences = mContext.getSharedPreferences(SHARED_CONFIG,
                Context.MODE_PRIVATE);
    }

    public SharedPreferencesUtil(Context context, String name) {
        this.mContext = context;
        mSharedpreferences = mContext.getSharedPreferences(name,
                Context.MODE_PRIVATE);
    }


    public boolean saveSharedPreferences(String key, String value) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    public String loadStringSharedPreference(String key) {
        String str = null;
        str = mSharedpreferences.getString(key, null);
        return str;
    }

    public String loadStringSharedPreference(String key, String preKey) {
        String str = null;
        str = mSharedpreferences.getString(key, preKey);
        return str;
    }

    public boolean saveSharedPreferences(String key, int value) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    public int loadIntSharedPreference(String key) {
        return mSharedpreferences.getInt(key, 0);
    }

    public boolean saveSharedPreferences(String key, float value) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putFloat(key, value);
        return editor.commit();
    }

    public float loadFloatSharedPreference(String key) {
        return mSharedpreferences.getFloat(key, 0f);
    }

    public boolean saveSharedPreferences(String key, Long value) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    public long loadLongSharedPreference(String key) {
        return mSharedpreferences.getLong(key, 0);
    }

    public boolean saveSharedPreferences(String key, Boolean value) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    public boolean loadBooleanSharedPreference(String key) {
        return mSharedpreferences.getBoolean(key, false);
    }

    public boolean saveSharedPreferences(String key, Set<String> set) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.putStringSet(key, set);
        return editor.commit();
    }

    public Set<String> loadSetSharedPreference(String key) {
        return mSharedpreferences.getStringSet(key, null);

    }

    public boolean saveAllSharePreference(String keyName, List<?> list) {
        int size = list.size();
        if (size < 1) {
            return false;
        }
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        if (list.get(0) instanceof String) {
            for (int i = 0; i < size; i++) {
                editor.putString(keyName + i, (String) list.get(i));
            }
        } else if (list.get(0) instanceof Long) {
            for (int i = 0; i < size; i++) {
                editor.putLong(keyName + i, (Long) list.get(i));
            }
        } else if (list.get(0) instanceof Float) {
            for (int i = 0; i < size; i++) {
                editor.putFloat(keyName + i, (Float) list.get(i));
            }
        } else if (list.get(0) instanceof Integer) {
            for (int i = 0; i < size; i++) {
                editor.putLong(keyName + i, (Integer) list.get(i));
            }
        } else if (list.get(0) instanceof Boolean) {
            for (int i = 0; i < size; i++) {
                editor.putBoolean(keyName + i, (Boolean) list.get(i));
            }
        }
        return editor.commit();
    }

    public Map<String, ?> loadAllSharePreference() {
        return mSharedpreferences.getAll();
    }

    public boolean removeKey(String key) {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.remove(key);
        return editor.commit();
    }

    public boolean removeAllKey() {
        SharedPreferences.Editor editor = mSharedpreferences.edit();
        editor.clear();
        return editor.commit();
    }

    public void setPreferences(String name) {
        mSharedpreferences = mContext.getSharedPreferences(name,
                Context.MODE_PRIVATE);
    }
}
