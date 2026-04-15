package com.techm.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techm.entity.Train;
import com.techm.service.TrainService;

@Controller
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping("/add")
    public String showAddTrainForm(Model model) {
        model.addAttribute("train", new Train());
        return "addtrain";
    }

    @PostMapping("/add")
    public String addTrain(@ModelAttribute("train")  Train train, BindingResult result) {
        if (result.hasErrors()) {
            return "addtrain";
        }
        trainService.addTrain(train);
        return "redirect:/train/list";
    }

    @GetMapping("/list")
    public String showTrainList(Model model) {
        model.addAttribute("trains", trainService.getAllTrains());
        return "trainlist";
    }

    @GetMapping("/edit/{id}")
    public String showEditTrainForm(@PathVariable("id") Long id, Model model) {
        Train train = trainService.getTrainById(id);
        model.addAttribute("train", train);
        return "edit_train";
    }

    @PostMapping("/update/{id}")
    public String updateTrain(@PathVariable("id") Long id, @ModelAttribute("train")  Train train,
                              BindingResult result, Model model) {
        if (result.hasErrors()) {
            train.setTrainId(id);
            return "edit_train";
        }
        trainService.updateTrain(train);
        return "redirect:/train/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrain(@PathVariable("id") Long id) {
        trainService.deleteTrain(id);
        return "redirect:/train/list";
    }
}

