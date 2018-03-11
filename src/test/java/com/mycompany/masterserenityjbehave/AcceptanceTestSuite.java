package com.mycompany.masterserenityjbehave;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();
        //storyPaths.add( "stories/login/Enroll.story" );
        storyPaths.add( "stories/Course/Enroll.story" );
        return storyPaths;
        
    }
}
