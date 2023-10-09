package com.utn.Tp.servicies;

import com.utn.Tp.entities.Autor;
import com.utn.Tp.repositories.AutorRepository;
import com.utn.Tp.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
