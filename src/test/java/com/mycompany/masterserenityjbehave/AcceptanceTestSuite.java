package com.mycompany.masterserenityjbehave;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();


        //s
//        storyPaths.add("stories/Account/Login.story");
//        storyPaths.add("stories/Account/LoginInvalid.story");
//        storyPaths.add("stories/Account/MelihatProfilValid.story");
//        storyPaths.add("stories/Account/Logout.story");
//        storyPaths.add( "stories/Course/MancariCourseValid.story" );
//        storyPaths.add( "stories/Course/MengenrollValid.story" );
//        storyPaths.add( "stories/Course/MelihatGradeValid.story" );
//        storyPaths.add( "stories/Course/MelihatSemuaMatakuliahValid.story" );
//        storyPaths.add( "stories/Account/LihatMessage.story" );
//        storyPaths.add("stories/Account/MengeditProfileValid.story");

        //pending dibagian akhir testnya ada pending
        //storyPaths.add("stories/Account/MendaftarAkunElokValid.story");



        //otw success
        //LOGIN NYA DIGANTI AKUN FRANS14645 DULU
        storyPaths.add("stories/Course/MengenrollDenganEnrollmentKeyValid.story");

//kurang implementasi then
        //storyPaths.add("stories/Course/MelakukanUnenrollValid.story");
        //MelihatSemuaMatakuliahValid.story

        return storyPaths;

    }
}
