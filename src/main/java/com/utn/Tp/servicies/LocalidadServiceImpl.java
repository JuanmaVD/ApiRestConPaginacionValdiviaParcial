package com.utn.Tp.servicies;

import com.utn.Tp.entities.Localidad;
import com.utn.Tp.repositories.BaseRepository;
import org.springframework.stereotype.Service;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }
}
