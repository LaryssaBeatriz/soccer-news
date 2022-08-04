package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.news;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<news>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        //TODO Remover Mock de noticias
        List<news> news1 = new ArrayList<>();
        news1.add(new news("Bahia vence Vitória", "O time ganhou de 5 a 0 do rival"));
        news1.add(new news("Ferroviária tem desfalque importante para próximo jogo", "O time conta com sua principal atacante contundida"));
        news1.add(new news("Copa do mundo ta perto ein", "Brasil hexa só não é um sonho porque já é realidade"));

        news.setValue(news1);
    }

    public LiveData<List<news>> getNews() {
        return news;
    }
}