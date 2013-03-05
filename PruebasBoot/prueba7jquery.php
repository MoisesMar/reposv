<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demo</title>
    <script src="js/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!--<script src="js/bootstrap/js/bootstrap-dropdown.js"></script>-->
    <!--<script src="js/bootstrap/js/bootstrap.js"></script>-->
    <script src="js/prueba7jquery.js" type="text/javascript"></script>
    <link href="js/prueba7jquery.css" rel="stylesheet" type="text/css"/>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <!--<link href="js/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">-->
    
    
  </head>
   <body>
       
       
       
       <!--Menu deplegable-->
       <aside class="sidebar">
       <ul class="topnav">
           <li><a href="#">Home</a></li>
           <li>
               <a href="#">Tutorials</a>
               <ul class="subnav">
                   <li><a href="#">Sub Nav Link</a></li>
                   <li><a href="#">Sub Nav Link</a></li>
                   <li><a href="#">Sub Nav Link</a></li>
                   <li><a href="#">Sub Nav Link</a></li>
               </ul>
           </li>
           <li>
               <a href="#">Resources</a>
               <ul class="subnav">
                   <li><a href="#">Sub Nav Link</a></li>
                   <li><a href="#">Sub Nav Link</a></li>
               </ul>
           </li>
           <li><a href="#">About Us</a></li>
           <li><a href="#">Advertise</a></li>
           <li><a href="#">Submit</a></li>
           <li><a href="#">Contact Us</a></li>
       </ul>
       </aside>
       <br/><br/>
       
       <ul class="breadcrumb">
            <li><a href="#">Home</a> <span class="divider">/</span></li>
            <li><a href="#">Library</a> <span class="divider">/</span></li>
            <li class="active">Data</li>
        </ul>
       
       <div class="btn-group">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                <button class="btn-info">Action</button>
                <span class="caret"></span>
            </a>
           <!--<button class="btn-info">Action</button>-->
            <ul class="dropdown-menu">
                <!-- dropdown menu links -->
                <li><a tabindex="-1" href="#">Action</a></li>
                <li><a tabindex="-1" href="#">Another action</a></li>
                <li><a tabindex="-1" href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="#">Separated link</a></li>
            </ul>
        </div>
       
       <div class="btn-group">
           <button class="btn">Action</button>
           <button class="btn dropdown-toggle" data-toggle="dropdown">
               <span class="caret"></span>
           </button>
           <ul class="dropdown-menu">
               <!-- dropdown menu links -->
               <li><a tabindex="-1" href="#">Action</a></li>
                <li><a tabindex="-1" href="#">Another action</a></li>
                <li><a tabindex="-1" href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="#">Separated link</a></li>
           </ul>
       </div>
       
       
       <div class="btn-group">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                Action
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <!-- dropdown menu links -->
                <li><a tabindex="-1" href="#">Action</a></li>
                <li><a tabindex="-1" href="#">Another action</a></li>
                <li><a tabindex="-1" href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="#">Separated link</a></li>
            </ul>
        </div>    
       
       <br/>
       
       
       
       <div class="row">
           <div class="span4">Div uno</div>
           <div class="span8">Div dos</div>
       </div>
       
       <div class="row">
           <div class="span9">
               Level 1 column
               <div class="row">
                   <div class="span6">Level 2</div>
                   <div class="span3">Level 2</div>
               </div>
           </div>     
      </div>
       
       <div class="row-fluid">
           row fluid]
           <div class="span12">
               Fluid 12
               <div class="row-fluid">
                   <div class="span6">
                       Fluid 6
                       <div class="row-fluid">
                           <div class="span6">Fluid 6</div>
                           <div class="span6">Fluid 6</div>
                       </div>
                   </div>
                   <div class="span6">Fluid 6</div>
               </div>
           </div>
       </div>
       <div class="container">container</div>
       
        <p class="text-left">Left aligned text.</p>
        <p class="text-center">Center aligned text.</p>
        <p class="text-right">Right aligned text.</p>

        
        
        
        <div class="dropdown">
            <!-- Link or button to toggle dropdown -->
            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                <li><a tabindex="-1" href="#">Action</a></li>
                <li><a tabindex="-1" href="#">Another action</a></li>
                <li><a tabindex="-1" href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="#">Separated link</a></li>
            </ul>
        </div>
       
        <div class="text-center"><input type="button" value="ok" class="btn btn-success"></div>
        <div class="text-center"><input type="button" value="ok" class="btn btn-info"></div>
        <i class='icon-star'></i>
        <i class='icon-plus'></i>
       
        <div>
            si
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
            <li><a tabindex="-1" href="#">Regular link</a></li>
            <li class="disabled"><a tabindex="-1" href="#">Disabled link</a></li>
            <li><a tabindex="-1" href="#">Another link</a></li>
        </ul>
        </div>
        
        <div style="background: #FAFAFA; width: 100px">
        <ul class="tabs">
            <li class="active"><a href="#">Home</a></li>
            <li class="dropdown" data-dropdown="dropdown" >
                <a href="#" class="dropdown-toggle">Dropdown</a>
                <ul class="dropdown-menu">
                    <li><a href="#">Secondary link</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Another link</a></li>
                </ul>
            </li>
        </ul>
        </div>
        
        
        
   </body>
</html>