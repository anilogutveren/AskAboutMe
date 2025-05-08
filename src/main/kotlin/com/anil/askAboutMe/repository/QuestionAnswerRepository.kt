package com.anil.askAboutMe.repository

import com.anil.askAboutMe.entity.QuestionAnswerPairEntity
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface QuestionAnswerRepository : JpaRepository<QuestionAnswerPairEntity, Long> {
}