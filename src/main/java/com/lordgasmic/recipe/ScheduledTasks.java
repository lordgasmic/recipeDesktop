package com.lordgasmic.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lordgasmic.recipe.db.repository.RecipeRepository;

@Component
public class ScheduledTasks {

    @Autowired
    private RecipeRepository drawRepository;

    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() {
        //HTML.parseUpdateAndCleanDraws(dbHelper);
    	
    }
    
}
