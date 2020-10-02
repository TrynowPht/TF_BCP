import { Component } from '@angular/core';
import * as $ from "jquery";
import { NotificacionService } from './servicio/notificacion.service';

$(document).ready(function(){
  $(".btn-submit").click(function(){
    $(".overlay").addClass('active');
  });
});

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'DesafioBCP';
  confirmacion:String;

  constructor(private notificationService:NotificacionService){
  } 

  ngOnInit(){
    console.log(this.confirmacion)
  }

  recibirConfirmacion(){
    this.confirmacion = "si"
    //console.log(this.confirmacion)
    this.notificationService.sendConfirmation(this.confirmacion).subscribe(res => console.log(this.confirmacion))
  }
}
