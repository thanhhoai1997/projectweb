package com.example.bewebquanlytoanha.services.company;

import com.example.bewebquanlytoanha.dtos.CompanyDTO;
import com.example.bewebquanlytoanha.model.Company;
import com.example.bewebquanlytoanha.repositories.company.ICompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ICompanyRepository iCompanyRepository;
    @Override
    public Page<CompanyDTO> findAll(Pageable pageable) {
        Page<Company> companies = iCompanyRepository.findAll(pageable);
        Page<CompanyDTO> companyDTOS = companies.map(company -> modelMapper.map(company,CompanyDTO.class));
        return companyDTOS;
    }

    @Override
    public void save(CompanyDTO companyDTO) {

        Company company = modelMapper.map(companyDTO,Company.class);
        iCompanyRepository.save(company);
    }

    @Override
    public CompanyDTO findById(Long id) {
        CompanyDTO companyDTO = modelMapper.map(iCompanyRepository.findById(id).get(),CompanyDTO.class);
        return companyDTO;
    }


    @Override
    public void deleteById(Long id) {
        iCompanyRepository.deleteById(id);
    }
}
