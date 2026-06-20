package re.edu.doctorservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.edu.doctorservice.dto.response.DoctorResponseDTO;
import re.edu.doctorservice.repository.IDoctorRepository;
import re.edu.doctorservice.service.IDoctorService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements IDoctorService {

    private final IDoctorRepository doctorRepository;

    @Override
    public List<DoctorResponseDTO> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctor -> DoctorResponseDTO.builder()
                        .id(doctor.getId())
                        .name(doctor.getName())
                        .specialization(doctor.getSpecialization())
                        .build())
                .collect(Collectors.toList());
    }
}
