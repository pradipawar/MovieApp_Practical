package com.example.movieapp.view.detail;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movieapp.model.ShowDetails;
import com.example.movieapp.repo.ShowRepository;

public class ShowDetailViewModel extends AndroidViewModel
{
    private final ShowRepository mShowRepository;

    public ShowDetailViewModel(@NonNull Application application)
    {
        super(application);
        mShowRepository = ShowRepository.getInstance(application);
    }

    public LiveData<ShowDetails> getShowDetails(String imdbid){
        return  mShowRepository.getShowDetails(imdbid);
    }

}
