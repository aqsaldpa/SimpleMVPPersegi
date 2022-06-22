package com.example.mvpapp.Presenter;

public class RumusPresenterImp implements RumusPresenter {
    RumusView rumusView;

    public RumusPresenterImp(RumusView rumusView) {
        this.rumusView = rumusView;
    }

    @Override
    public void hitungLuas(Double Panjang, Double Lebar) {
        Double luas = Panjang * Lebar;
        rumusView.hasilLuas(luas);
    }

    @Override
    public void hitungKeliling(Double Panjang, Double Lebar) {
        Double keliling = 2*(Panjang*Lebar);
        rumusView.hasilKeliling(keliling);
    }
}
