package com.example.expensetrackerwithgroups;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setupBottomNavigation();
    }
    
    private void setupBottomNavigation() {
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            
            int itemId = item.getItemId();
            if (itemId == R.id.nav_add_expense) {
                // TODO: Add expense fragment
                return true;
            } else if (itemId == R.id.nav_groups) {
                // TODO: Groups fragment
                return true;
            } else if (itemId == R.id.nav_analytics) {
                // TODO: Analytics fragment
                return true;
            } else if (itemId == R.id.nav_settings) {
                // TODO: Settings fragment
                return true;
            }
            
            return false;
        });
    }
} 