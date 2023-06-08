package com.example.things.with.pings.lazyandeagerloading.repository;

import com.example.things.with.pings.lazyandeagerloading.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 6/4/2023
 */

@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {
}
