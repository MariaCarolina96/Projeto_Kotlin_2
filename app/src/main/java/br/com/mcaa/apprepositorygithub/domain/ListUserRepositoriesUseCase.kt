package br.com.mcaa.apprepositorygithub.domain

import br.com.mcaa.apprepositorygithub.core.UseCase
import br.com.mcaa.apprepositorygithub.data.model.Repo
import br.com.mcaa.apprepositorygithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase (
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}