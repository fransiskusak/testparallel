package com.mycompany.elok;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite3 extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();
        storyPaths.add("stories/Account/Positive/LoginInvalid.story");
        return storyPaths;
    }
}
