package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("goalService")
public class GoalServiceImpl implements GoalService{

    @Autowired
    private GoalRepository goalRepository;

    @Transactional
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    @Transactional
    public Goal getGoal(long goalId){
        return goalRepository.get(goalId);
    }

    @Transactional
    public List<Goal> getAllGoals() {
        return goalRepository.loadAll();
    }

    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }
}
