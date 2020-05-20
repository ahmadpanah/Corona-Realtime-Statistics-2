package com.university.corona2.ui.country;

public class CovidCountry {
    String mCovidCountry , mCases , mTodayCases , mDeaths , mTodayDeaths , mRecoverd;

    public CovidCountry (String mCovidCountry , String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecoverd = mRecoverd;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }
}
