package br.com.mcaa.apprepositorygithub.data.repositories;

import br.com.mcaa.apprepositorygithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}