package com.trendyol.stock.mapper;

import java.util.List;

public interface IEntityMapper <R,E>{
//toDto ve toEntity fonksiyonlarını yazıyoruz
    R toDto(E e);

    E toEntity(R r);

    List<R> toDto(List<E> eList);

    List<E> toEntity(List<R> rList);
}
