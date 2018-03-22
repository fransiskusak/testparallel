package com.mycompany.masterserenityjbehave;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();
        //storyPaths.add( "stories/Course/MengenrollValid.story" );
        //storyPaths.add( "stories/Course/CariEnroll.story" );
        //storyPaths.add("stories/Registration/MendaftarElokValid.story");
        storyPaths.add( "stories/Account/MengeditProfileValid.story" );
        //storyPaths.add( "stories/login/LoginInvalid.story" );



        return storyPaths;

    }
}
