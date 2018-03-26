package android.example.com.visualizerpreferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.preference.CheckBoxPreference;
import android.support.v7.preference.EditTextPreference;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;
import android.widget.Toast;

/**
 * Created by xtreme 7pro on 3/25/2018.
 */

// COMPLETED (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
public class SettingsFragment extends PreferenceFragmentCompat {
    // COMPLETED (5) In SettingsFragment's onCreatePreferences method add the preference file using the

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        // addPreferencesFromResource method
        // Add visualizer preferences, defined in the XML file in res->xml->pref_visualizer
        addPreferencesFromResource(R.xml.pref_visualizer);

    }





}
