import { Component, OnInit } from '@angular/core';
import { MovieService } from './core/service/movie.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  movies:ResponseModel;
  
  constructor(private movieService:MovieService){}
  
  ngOnInit(): void {
    this.movieService.getUpcoming(1).subscribe(response => {
      this.movies = response.data;
    });
  }
  

}
